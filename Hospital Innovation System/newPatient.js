var config = {
    apiKey: "AIzaSyAE_uR792SUX30lHlcDVfCEiBlvuyc1OFI",
    authDomain: "hapi-ae003.firebaseapp.com",
    databaseURL: "https://hapi-ae003.firebaseio.com",
    projectId: "hapi-ae003",
    storageBucket: "hapi-ae003.appspot.com",
    messagingSenderId: "863055207384"
  };
  firebase.initializeApp(config);

// creates a new patient, mimics the patient admissions form, user has to select ID for now.
function sendNewPatient(userID) {

  
  
//variables for patient form

  var DOBVal = document.getElementById('DOB').value;
  var nameVal = document.getElementById('name').value;
  var addressVal = document.getElementById('address').value;
  var bloodVal= document.getElementById('bloodType').value;
  var conditionVal = document.getElementById('condition').value;
  var idVal = document.getElementById('userId').value;
  var ageVal = document.getElementById('age').value;
  var genderVal = document.getElementById('gender').value;
  var martialVal = document.getElementById('martial').value;
  var occupationVal = document.getElementById('occupation').value;

  var allergiesVal = document.getElementById('allergies').value;
  var allergicReactionVal = document.getElementById('allergicReaction').value;
  var datePreAssessmentVal = document.getElementById('dateOfPreAssessment').value;
  var mrsa = document.getElementById('mrsa').value;

  var nameNurse = document.getElementById('nurseName').value;
  var patientUnderstandingVal = document.getElementById('understandingOfAdmission').value;
  var proposedSurgery = document.getElementById('proposedSurgery').value;
  var proposedDate = document.getElementById('proposedDateOfSurgery').value;
  var recentAdmission = document.getElementById('recentAdmission').value;
  var nextOfKin = document.getElementById('nextOfKinName').value;
  var nextOfKinAddress = document.getElementById('nextOfKinAddress').value;
  var nextOfKinPhone = document.getElementById('nextOfKinPhone').value;

  var nextOfKinRelationship = document.getElementById('nextOfKinRelationship').value;
  var PHN = document.getElementById('PHN').value;
  var gpName = document.getElementById('gpName').value;
  var gpAddress= document.getElementById('gpAddress').value;
  var medicalCard = document.getElementById('medicalCard').value;
  var surgeryPhone = document.getElementById('surgeryPhone').value;

  
 //snapshots and sending information
var ref = firebase.database().ref().child('Patients').child(idVal).child('Patient Information').child('Personal');
   ref.update({

            Age:ageVal,
            Gender:genderVal,
            MartialStatus:martialVal,
            Address: addressVal, 
            BloodType:bloodVal,
            DOB: DOBVal,
            Condition: conditionVal,
            Name: nameVal,
            Occupation:occupationVal


  });
//snapshot and sending information into folders
var ref1 = firebase.database().ref().child('Patients').child(idVal).child('Patient Information').child('Contact');

ref1.update({
            NextOfKinName:nextOfKin,
            NextOfKinAddress:nextOfKinAddress,
            NextOfKinPhone:nextOfKinPhone,
            NextOfKinRelationship: nextOfKinRelationship,
            GpName: gpName,
            GpAddress:gpAddress,
            SurgeryPhone:surgeryPhone,
            MedicalCard:medicalCard,
            PHN:PHN



});

    //sending information to 'Treatment'
var ref2 = firebase.database().ref().child('Patients').child(idVal).child('Patient Information').child('Treatment');

   ref2.update({

            ProposedSurgery:proposedSurgery,
            ProposedDate:proposedDate,
            PatientUnderstandingOfAdmission:patientUnderstandingVal,
            Allergies:allergiesVal,
            AllergicReaction:allergicReactionVal,
            MRSA:mrsa,
            RecentAdmission:recentAdmission,
            DatePreAssesment:datePreAssessmentVal,
            NameofNurse:nameNurse

   });



}
