
    // Get references to form elements
    const surveyForm = document.getElementById("surveyForm");
    const firstName = document.getElementById("firstName");
    const lastName = document.getElementById("lastName");
    const dob = document.getElementById("dob");
    const country = document.getElementById("country");
    const genderRadioButtons = document.getElementsByName("gender");
    const profession = document.getElementById("profession");
    const email = document.getElementById("email");
    const mobile = document.getElementById("mobile");

    // Function to validate the form
    function validateForm() {
        // Check each field for validation
        if (firstName.value === "") {
            alert("Please enter your First Name.");
            return false;
        }
        if (lastName.value === "") {
            alert("Please enter your Last Name.");
            return false;
        }
        if (dob.value === "") {
            alert("Please enter your Date of Birth.");
            return false;
        }
        if (country.value === "") {
            alert("Please select your Country.");
            return false;
        }
        let selectedGender = false;
        for (const radio of genderRadioButtons) {
            if (radio.checked) {
                selectedGender = true;
                break;
            }
        }
        if (!selectedGender) {
            alert("Please select your Gender.");
            return false;
        }
        if (profession.value === "") {
            alert("Please enter your Profession.");
            return false;
        }
        if (email.value === "" || !email.checkValidity()) {
            alert("Please enter a valid Email.");
            return false;
        }
        if (mobile.value === "" || !mobile.checkValidity()) {
            alert("Please enter a valid Mobile Number.");
            return false;
        }
        return true;
    }

    // Handle form submission
    surveyForm.addEventListener("submit", function (event) {
        if (!validateForm()) {
            event.preventDefault(); // Prevent form submission on validation failure
        } else {
            // If validation is successful, display the popup
            // You can customize this part to display the selected values in the popup
            alert("Form submitted successfully!"); // Replace with your desired logic
        }
    });

