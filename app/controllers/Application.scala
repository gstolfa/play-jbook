package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

	/****************************
	*	To put html page
	*****************************/
  def index = Action {
    //Ok(views.html.index("Gianfranco Stolfa"))
	Ok(views.html.listContainer(3, Seq("uno","due", "ciccio")))    
  }




	/*****************************
	*	To put json responce
	******************************/
	/*
	def index = Action {
		import play.api.libs.json._
		Ok(JsObject(Seq("nome"    -> JsString("Gianfranco"),
						"cognome" -> JsString("Stolfa"))))	
	}
	*/






}
