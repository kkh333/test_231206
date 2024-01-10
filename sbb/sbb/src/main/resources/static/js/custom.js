$(document).ready(function(){

    $("#suggestion_btn").click(function() {
        $.ajax({
            type: "POST",
            url: "/user/suggestion",
            success: function(response) {
                $("#suggestion_num").text(response.count);
            },
            error: function(error) {
                console.error(error);
            }
        });
    });

});