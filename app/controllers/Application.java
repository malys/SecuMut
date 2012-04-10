package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import controllers.securesocial.SecureSocial;

import models.*;

//@With(SecureSocial.class)
public class Application extends Controller {

	public static void index() {

		render();
	}

}