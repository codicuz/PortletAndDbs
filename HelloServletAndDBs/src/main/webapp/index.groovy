html.html() {
    head() {
        title("This is the title")
    }
    body() {
        div("class" : "title") {
            h1("this is TITLE of body")
        }

        div("class" : "main") {
            p("this is the body")
        }

        div() {
            p("This is the body 1")
            p("This is the body 2")
            p("This is the body 3")
        }

        div() {
            form("action" : "index.jsp", "method" : "post") {
                input("type" : "submit", "value" : "This is index.jsp page")
            }
        }
    }
}

println("This is groovy pages")
