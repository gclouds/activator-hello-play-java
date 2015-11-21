package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
    
    public static Result index() {
        return ok(views.html.index.render("Something new is coming soon, for queries: gaurav@drashtee.com or +91 8904667815"));
    }
    
}
