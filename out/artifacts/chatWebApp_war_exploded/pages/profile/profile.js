// var PROFILE_URL = buildUrlWithContextPath("profileServlet");
//
// function ajaxUserName(){
// $.ajax({
//     url: "profileServlet",
//     type: 'GET',
//     dataType: 'json',
//     success: function(response) {
//         setUserName(response.activeUser);
//     },
//     error: function(error) {
//         console.log("ERROR: " + error);
//     }
//     });
// }
//
// function setUserName(username) {
//     document.getElementById("username").innerHTML = "ssss";
// }
//
// var session_data = document.getElementById('username').value;
// document.getElementById("username").innerHTML = '${username}';

// $(function() {
//     //ajaxUserName();
//     var session_data = document.getElementById('sessionid').value;
//     document.getElementById("username").innerHTML = "0000";
// })(jQuery);

$(document).ready(
    function () {
        document.getElementById("username").innerHTML = '${username}';
    });