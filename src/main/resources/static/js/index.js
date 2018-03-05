$(document).ready(function () {
    $.ajax({
            url: "/website/get-forms",
            type: "get",
            success: function (forms) {
                $.each(forms, function (index, form) {
                    var ref = $('<a></a>');
                    ref.text(form.name);
                    ref.attr('href','/website/forms/'+form.formId)
                    $('div.forms').append($('<div></div>').append(ref));
                });
            }
        }
    );

});
