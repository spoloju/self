function mbl() {

    var num = document.getElementById('test_mbl');
    var filter = /([6-9]{1}[0-9]{9})$/;

    if (!filter.test(num.value)) {
    alert('Please provide a valid mobile number');
    num.focus;
    return false;
    }
    else{
        alert("successfully verified ..!")
    }
}



// [0-9]----->   \d

// [a-zA-Z] ---->   \w
