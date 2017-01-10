package com.example

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class TestController extends Controller {

  get("/test") { request: Request =>
    response.ok.body(html.index.render("Use Twirl template in Finatra").toString())
      .contentType("text/html")
  }

}
