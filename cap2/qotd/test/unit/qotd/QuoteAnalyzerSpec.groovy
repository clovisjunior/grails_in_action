package qotd

import spock.lang.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
class QuoteAnalyzerSpec extends Specification {

	@Shared quotes = [
		new Quote(author: "Peter Ledbrook", content: "Time waits for no man"),
		new Quote(author: "Glen Smith", content: "Groovy solves all problems")
	]
  
  	def "Total number of quotes"() {
  		given: "An analyzer initialized with known quotes"
  		def analyzer = new QuoteAnalyzer(quotes)

  		when: "I ask for the quote count"
  		def quoteCount = analyzer.quoteCount

  		then: "The number of quotes in the test list is returned"
  		quoteCount == 2
  	}
}