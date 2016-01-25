package controllers

import play.api._
import play.api.mvc._
import org.joda.time.LocalTime
import models.Chat
import models.Item
import org.joda.time.DateTime
import org.joda.time.Days

class Application extends Controller {

	/****************************
	*	To put html page
	*****************************/
  def index = Action {
	val today = DateTime.now();
    val yesterday = today.minus(Days.ONE);

    val chat11 = Chat(yesterday, 1, Seq(
        Item("me",     LocalTime.now(), "Hello!"),
        Item("other",  LocalTime.now(), "Hi!"),
        Item("me",     LocalTime.now(), "Fine?"),
        Item("other",  LocalTime.now(), "Yes")
    ));
    //later on
    val chat12 = Chat(yesterday, 2, Seq(
        Item("me",     LocalTime.now(), "It's hot today!"),
        Item("other",  LocalTime.now(), "Indeed...")
    ));

    val chat21 = Chat(today, 1, Seq(
        Item("me",     LocalTime.now(), "Hello!"),
        Item("me",     LocalTime.now(), "Youhou?"),
        Item("no-one", LocalTime.now(), "...")
    ));
    val chat22 = Chat(today, 2, Seq(
        Item("me",     LocalTime.now(), "Ding ding!"),
        Item("me",     LocalTime.now(), "Poueeeeeeeeeet?"),
        Item("no-one", LocalTime.now(), "...")
    ));

    val chat23 = Chat(today, 3, Seq(
        Item("me",     LocalTime.now(), "No one?"),
        Item("no-one", LocalTime.now(), "Yes?")
    ));

 	Ok(views.html.index("Chat Archives")(Seq(
                chat23,
                chat11, 
                chat21, 
                chat12, 
                chat22
            ))
        );


	/*  	
     Ok(views.html.index("message da controller")(1
     	, Seq(
     		Chat("user_1", LocalTime.now(), "message_1"),
     		Item("user_2", LocalTime.now(), "message_2"),
     		Item("user_3", LocalTime.now(), "message_3")
     		)))
    */
	// Ok(views.html.listContainer(2, Seq("uno","due", "tre")))    
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
