$(document).ready(function () {

        $("#task-form").submit(function(event) {
                //stop submit the form, we will post it manually.
                event.preventDefault();
                fire_ajax_submit();
        });

});

function fire_ajax_submit() {
    var task = {}
    task["leftSide"] = $("#leftSide").val();
    task["rightSide"] = $("#rightSide").val();
    task["answer"] = $("#answer").val();

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/api/task",
        data: JSON.stringify(task),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function(data) {
            var json="<h4>Ajax Response</h4><pre>"+JSON.stringify(data,null,4)+"</pre>";
            $("#feedback").html(json);
            console.log("Success:",data);

            if (data["taskCorrect"]==false) {
                $("#correct").hide();
                $("#incorrect").show();
                $("#button").hide();
            }
            else {
                $("#incorrect").hide();
                $("#correct").show();
                $("#button").hide();
            }
        },
        error:function(e) {
            var json="<h4>Ajax Response Error</h4><pre>"+e.responseText+"<pre>";
            $("feedback").html(json);
            console.log("ERROR:",e);
        }
    });
}