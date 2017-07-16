spring-boot-i18n-mvn
====================

source code for codesanook aritcle (Maven Version)
> [สร้าง website รองรับหลายภาษา ด้วย i18n internationalization Java Spring Boot](http://codesanook.com/post/details/crate-website-that-supports-multiple-languages-with-i18n-internationalization-java-spring-boot/48)

## Run
```
mvn clean spring-boot:run
```

## Test
 * TH [http://localhost:8080?lang=th](http://localhost:8080?lang=th)
 * EN [http://localhost:8080?lang=en](http://localhost:8080?lang=en)
 
## Notes
 - [Implement with JSP as view](http://www.journaldev.com/2610/spring-mvc-internationalization-i18n-and-localization-l10n-example)

```xml
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<spring:message code="label.firstName" />
```

## Others
 - http://www.baeldung.com/spring-boot-internationalization