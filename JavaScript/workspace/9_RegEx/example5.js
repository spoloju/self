function mbl() {

    var num = document.getElementById('test_mbl');
    var filter = /^([0-9]{3}).([0-9]{3}).([0-9]{2}).([0-9]{2})$/;

    if (!filter.test(num.value)) {
    alert('Please provide a valid ip');
    num.focus;
    return false;
    }
    else{
        alert("successfully verified ..!")
    }
}

