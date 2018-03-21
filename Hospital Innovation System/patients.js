var config = {
    apiKey: "AIzaSyAE_uR792SUX30lHlcDVfCEiBlvuyc1OFI",
    authDomain: "hapi-ae003.firebaseapp.com",
    databaseURL: "https://hapi-ae003.firebaseio.com",
    projectId: "hapi-ae003",
    storageBucket: "hapi-ae003.appspot.com",
    messagingSenderId: "863055207384"
  };
  firebase.initializeApp(config);

  var Day = "Day";
  var i = 2;

  var patientCounter;
  var patientId = "000"+patientCounter;

  var array = []; //an array to capture the elements in the snap references

  var p = "Patients";   //just used a variable to find the reference point in firebase
  
  var userinput;
  var userSpecDay;
  const objectName = document.getElementById('name');
  const objectAddress = document.getElementById('address');
  const objectId = document.getElementById('id');
  const objectBlood = document.getElementById('blood');
  const objectCondition = document.getElementById('condition');



  const recordDate = document.getElementById('recordDate');
  const recordTemp = document.getElementById('recordTemp');
  const recordPain = document.getElementById('recordPain');
  const recordNurse = document.getElementById('recordNurse');
  const recordCheck = document.getElementById('recordCheck');
  const recordPS = document.getElementById('recordPS');
  

  function onload() {
    var into = firebase.database().ref().child('Patients');
      into.once('value', function(snapshot) {
        var num = snapshot.numChildren();
        //console.log(num);
        var dec = num;
        i=1;
        while (i<=num){
          addPatientButtons("000"+i);
          dec++;
          i++;
        }
      });

  }
  onload();   //loads the users into buttons
  
  /*
  * how this function works:
  it takes in a user input which is a string that defines
  where the rootRef stops within the database. ex, if userinput
  is 0001, it will find the child 0001 and the variable will
  start at this point of the database. (line 54). We can 
  display the values through the 'on' function of this reference. (line 56)
  the following lines snap the values into a table.
  */
  
  
  function personChange (userinput) { //changes the person which references everything else
      resetDays(); //resets the days to none.
    
      var Address;    //attributes that will be displayed as part of person change
      var Name; 
      var Blood;
      var Condition;

      var DOB;
      this.userinput = userinput;
  
    var rootRef = firebase.database().ref().child('Patients').child(userinput).child('Patient Information').child('Personal'); //reference to part of firebase
  
    rootRef.on('value',snap => {
  
        objectName.innerHTML = snap.val().Name;
        objectId.innerHTML = snap.val().DOB;
        objectAddress.innerHTML = snap.val().Address;
        objectBlood.innerHTML = snap.val().BloodType;
        objectCondition.innerHTML = snap.val().Condition;
  
     });

    var into = firebase.database().ref().child('Patients').child(userinput).child('Records');

          into.once('value', function(snapshot) {
               var num = snapshot.numChildren();
               var dec = num;
               i=1;
                 while (i<=num){
                   addPatientDay("Day"+i);
                   dec++;
                  i++;
                 }
          });
  
  }
  
  function dayChange(userSpecDay) {       //changes the day of the user.


      this.userSpecDay = userSpecDay;
      var rootRefRec = firebase.database().ref().child('Patients').child(userinput).child('Records').child(userSpecDay); 
  
      rootRefRec.on('value',snap => {
  
     // recordBlood.innerHTML =snap.val().BloodPressureLevels;

      //recordBreath.innerHTML = snap.val().Comments;
     // recordPain.innerHTML = snap.val().PainLevels;
      recordNurse.innerHTML= snap.val().NurseNo;
      recordTemp.innerHTML= snap.val().Tempature;
      recordPain.innerHTML= snap.val().PainLevels;
      recordDate.innerHTML= snap.val().Date;
      recordCheck.innerHTML= snap.val().IntakeTime;
      recordPS.innerHTML = snap.val().Result;
  
      var recordDay = document.getElementById('day');
      recordDay.innerHTML=userSpecDay;
  
  });
    }
  

    function sendRecord (){
      if(userSpecDay===""){   //catches error
        alert("Error");

      }
      else{
       
      var rootRefRec = firebase.database().ref().child('Patients').child(userinput).child('Records').child(userSpecDay);
  
      var breathForm = document.getElementById('breath');
      var painForm = document.getElementById('pain');
      var updateBreath = breathForm.value;
      var updatePain = painForm.value;

  
    
      rootRefRec.update({
        BloodPressureLevels :updateBreath,
        PainLevels   :updatePain
      });
      
  }
 }
 

    function createDay() {        //creates day
      if(userinput==="undefined"){
        alert("error");
      }
        i++;
        var rootRefRec = firebase.database().ref().child('Patients').child(userinput).child('Records');
        rootRefRec.child("Day" + i).push("");
        
    }

    function deleteDay(){   //deletes Day
      var rootRefRec = firebase.database().ref().child('Patients').child(userinput).child('Records').child(userSpecDay);
      rootRefRec.remove();
    }

    function createPatient () {     //creates patient

      var count=0;

      var rootRefRec = firebase.database().ref().child('Patients');
    
      var into = firebase.database().ref().child('Patients');

          into.once('value', function(snapshot) {

                   count = snapshot.numChildren()+1;
                   patientId= "000"+count;
            
                   addPatientButtons(patientId);
         
                   rootRefRec = firebase.database().ref().child('Patients').child(patientId);
    
                           rootRefRec.child("Patient Information").set({

                                 

                           });
                           rootRefRec.child('Patient Information').child('Personal').set({
                              UserId : patientId,
                                   Age:"N/A",
                                   Gender:"N/A",
                                   MartialStatus:"N/A",
                                   Address: "N/A",
                                   BloodType:"N/A",
                                   DOB: "N/A",
                                   Condition: "N/A",
                                   Name: "N/A",
                                   Occupation:"N/A"

                           })
                           rootRefRec.child('Patient Information').child('Contact').set({
                              NextOfKinName:"N/A",
                              NextOfKinAddress:"N/A",
                              NextOfKinPhone:"",
                              NextOfKinRelationship:"",
                              GpName: "N/A",
                              GpAddress:"N/A",
                              SurgeryPhone:"N/A",
                              MedicalCard:"N/A",
                              PHN:"N/A",
                           })
                            rootRefRec.child('Patient Information').child('Treatment').set({
                              ProposedSurgery:"N/A",
                              ProposedDate:"N/A",
                              PatientUnderstandingOfAdmission:"N/A",
                              Allergies:"N/A",
                              AllergicReaction:"N/A",
                              MRSA:"N/A",
                              RecentAdmission:"N/A",
                              DatePreAssesment:"N/A",
                              NameofNurse:"N/A"


                           })


                    rootRefRec.child("Records").child("Day1").set({
                              
                                Comments:"",
                                Date:"",
                                Day:"",
                                PainLevels:"",
                                Time:"",
                                Tempature:"",
                                RespiratoryRate:"",
                                IVCheck:"",
                                WoundCheck:"",
                                NurseNo:"",
                                IntakeTime:"",
                                IntakeFluid:"",
                                OutType:"",
                                PainSystem:""

                     });

                    rootRefRec.child("Records").child("Day1").child("PS").set({
                      Activity:"",
                      Respiration:"",
                      Circulation:"",
                      Conciousness:"",
                      OxygenSaturation:"",
                      Dressing:"",
                      Pain:"",
                      Ambutation:"",
                      Fast_Feed:"",
                      UrineOutput:"",
                      Result:"",
                      Verdict:""
                    })
         });

    }


function createRecord() {
  var i;
  if(userinput==='undefined'){
    alert("error");
  }
  else {

      var rootRefRec = firebase.database().ref().child('Patients').child(userinput).child('Records');
      rootRefRec.once('value', function(snapshot) {


        i= snapshot.numChildren()+1;
           addPatientDay("Day"+i);

          rootRefRec.child("Day"+i).set({
            
                                Comments:"",
                                Date:"",
                                Day:"",
                                PainLevels:"",
                                Time:"",
                                Tempature:"",
                                RespiratoryRate:"",
                                IVCheck:"",
                                WoundCheck:"",
                                NurseNo:"",
                                IntakeTime:"",
                                IntakeFluid:"",
                                OutType:"",
                                PainSystem:""

              });
          rootRefRec.child("Day"+i).child("PS").set({
                      Activity:"",
                      Respiration:"",
                      Circulation:"",
                      Conciousness:"",
                      OxygenSaturation:"",
                      Dressing:"",
                      Pain:"",
                      Ambutation:"",
                      Fast_Feed:"",
                      UrineOutput:"",
                      Result:"",
                      Verdict:""
                    })

      });
      






 
  }  

       

}


function addPatientButtons(number){
 
   var div = document.getElementById('newStuff');
          var but = document.createElement("button");
          var t = document.createTextNode(number);
          var val = document.createValue;
          var stringnum = ""+number;
          but.appendChild(t);
          div.appendChild(but);
          but.value=stringnum;
          
          but.onclick=function(){personChange(number);}//"
          but.value=number;
          

}
function addPatientDay(day){
  
          var div = document.getElementById('daysDiv');
          var but = document.createElement("button");
          var t = document.createTextNode(day);
          var val = document.createValue;
          but.appendChild(t);
          div.appendChild(but); 
          but.onclick=function(){dayChange(day);}//"
          

}

function resetDays() {

        var div = document.getElementById('daysDiv');
        div.innerHTML="";
  
}

function deletePatient() {

         var rootRefRec = firebase.database().ref().child('Patients').child(userinput);
         rootRefRec.remove();
      
}

