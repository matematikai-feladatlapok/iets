$(document).ready(function() {
    $( ".task" ).submit(function( event ) {

        var formId = $(this).attr('id').toString();;
        //var result = "Form: "+frmId.toString();
        //alert(result)
        event.preventDefault();
        fire_ajax_submit(formId);
    });
});

function fire_ajax_submit(formId) {

    var task = {}

    leftSide = "leftSide-"+formId;
    rightSide = "rightSide-"+formId;
    answer = "answer-"+formId;

    correct = "correct-"+formId;
    incorrect = "incorrect-"+formId;
    button = "button-"+formId;

    task["leftSide"] = $("#"+leftSide).val();
    task["rightSide"] = $("#"+rightSide).val();
    task["answer"] = $("#"+answer).val();

    console.log(task);

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
            console.log(data["taskCorrect"]);

            if (data["taskCorrect"]==false) {
                $("#"+correct).hide();
                $("#"+incorrect).show();
                $("#"+button).hide();
            }
            else {
                $("#"+incorrect).hide();
                $("#"+correct).show();
                $("#"+button).hide();
            }
        },
        error:function(e) {
            var json="<h4>Ajax Response Error</h4><pre>"+e.responseText+"<pre>";
            $("feedback").html(json);
            console.log("ERROR:",e);
        }
    });
}