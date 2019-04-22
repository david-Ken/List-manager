
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <div class="collapse navbar-collapse text-center" id="navbarNav" >
            <a class="nav-link" href="#" ><b> MY LIST MANAGER</b> <span class="sr-only">(current)</span></a>
        </div>

        <div class="list-form">
            <form class="form-inline">
                <div class="form-group mb-2">
                    <label for="name" class="sr-only">List Name</label>
                    <input type="text" class="form-control" id="name" placeholder="List name">
                </div>
                <div class="form-group mx-sm-3 mb-2">
                    <label for="listDescription" class="sr-only">List description</label>
                    <input type="text" class="form-control" id="listDescription" placeholder="Enter list description">
                </div>
                <button  class="btn btn-primary mb-2" onclick="createList(e)">Create my list</button>
            </form>
        </div>
    </div>
</nav>
