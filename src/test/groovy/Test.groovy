import geb.Browser
import geb.spock.GebSpec

class Test extends GebSpec {
    def "Check the web page title"() {
        when: "I go to the home page"
        Browser.drive {
            go "/"
        }
        
        then: "The title should be Google"
        title == "Google"
    }
}
