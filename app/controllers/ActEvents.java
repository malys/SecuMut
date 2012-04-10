package controllers;

import play.mvc.*;

import controllers.CRUD.For;
import play.mvc.*;

@For(models.ActEvent.class)
public class ActEvents extends controllers.CRUD {

	public static void index() {
		render();
	}

}
