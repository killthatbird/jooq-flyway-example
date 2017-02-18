package gsch

import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static gsch.tables.People.PEOPLE

@RestController
@RequestMapping('/')
class HomeController {

  @Autowired DSLContext dsl

  @RequestMapping
  String index() {
    dsl.insertInto(PEOPLE)
      .set(PEOPLE.NAME, 'Gabriel Hora')
      .set(PEOPLE.AGE, 32)
      .execute()
    def result = dsl.selectFrom(PEOPLE).fetch()
    result.toString()
  }
}
