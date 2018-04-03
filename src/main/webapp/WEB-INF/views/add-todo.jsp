<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
    New Action:
    <form method="POST" action="/add-todo.do">
        <fieldset class="form-group">
            <label>Name</label>
            <input name="todo" type="text" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Category</label>
            <input name="category" type="text" class="form-control"/>
        </fieldset>
        <input name="add" type="submit" value="Submit" class="btn btn-success"/>
    </form>
</div>

<%@ include file="../common/footer.jspf"%>