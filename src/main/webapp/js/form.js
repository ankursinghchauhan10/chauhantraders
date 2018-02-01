/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function isNumeric(elem, helperMsg) {
        var numericExpression = /^[0-9]+$/;
        if (elem.value.match(numericExpression)) {
            return true;
        } else {
            alert(helperMsg);
            elem.focus();
            return false;
        }
    }
    
    function notEmpty(elem, helperMsg) {
    //alert(elem.value);
    if (elem.value.length == 0) {
        //alert(helperMsg);
        alert(helperMsg);
        elem.focus(); // set the focus to this input
        return false;
    }
    return true;
}
    
    function isMobile(elem, helperMsg) {
        
        if (elem.value.length==10) {
            return true;
        } else {
            alert(helperMsg);
            elem.focus();
            return false;
        }
    }

    function isAlphabet(elem, helperMsg) {
        var alphaExp = /^[a-zA-Z\s]+$/;
        if (elem.value.match(alphaExp)) {
            return true;
        } else {
            alert(helperMsg);
            elem.focus();
            return false;
        }
    }

    function isAlphanumeric(elem, helperMsg) {
        var alphaExp = /^[0-9a-zA-Z\s]+$/;
        if (elem.value.match(alphaExp)) {
            return true;
        } else {
            alert(helperMsg);
            elem.focus();
            return false;
        }
    }

function emailValidator(elem, helperMsg) {
    
//    var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
      var emailExp = /^[\w\_\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-Z0-9]{2,4}$/;
    if (elem.value.match(emailExp)) {
        return true;
    } else {
        alert(helperMsg);
        elem.focus();
        return false;
    }

}