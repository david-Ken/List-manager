//check off specific todos by clicking

$("ul").on("click", "li", function() {
  $(this).toggleClass("completed");
});

//click on X to delete todo
$("ul").on("click", "span", function(event) {
  $(this)
    .parent()
    .fadeOut(1000, function() {
      $(this).remove();
    });
  event.stopPropagation();
});

//add new todo
$("input[type='text']").keypress(function(event) {
  if (event.which === 13) {
    var newTodoText = $(this).val();
    $(this).val("");
    //create a new li and add to ul
    $("ul").append(
      "<li><span><i class='fa fa-trash'></i></span>" + newTodoText + "</li>"
    );
  }
});

$(".fa-plus").on("click", function() {
  $("input[type='text']").fadeToggle();
});

function createList(event) {
  event.preventDefault();
  const TEMPLATE = `
     <div class="col-lg-4 my-4">
          <div id="list-wrapper ml-2">
            <h1>${$("#name").val()}<i class="fa fa-plus"></i></h1>
            <h1 class="description"> ${$("#listDescription").val()}</h1>
            <input type="text" name="newToDo" placeholder="Add New Todo" />
            <ul>
              <li>
                <span><i class="fa fa-trash"></i></span>Meet Joseph
              </li>
              <li>
                <span><i class="fa fa-trash"></i></span>Buy eggs
              </li>
              <li>
                <span><i class="fa fa-trash"></i></span>Read a book
              </li>
              <li>
                <span><i class="fa fa-trash"></i></span>Haircut
              </li>
            </ul>
          </div>
        </div>
    `;

  $(".list-container").append(TEMPLATE);
  $("form :input").val("");
}
