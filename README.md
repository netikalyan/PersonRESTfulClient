![Android Build](https://github.com/netikalyan/PersonRESTfulClient/actions/workflows/android.yml/badge.svg)
# RESTful Client in Android
REST, an acronym for REpresentational State Transfer, is an architectural style for developing applications that can be accessed over the network. **[JAX-RS](https://docs.oracle.com/javaee/6/tutorial/doc/giepu.html)** (Java API for RESTful Web Services) is the Java API for creating REST web services.

**[PersonRESTfulService](https://github.com/netikalyan/PersonRESTfulService)** exposes the following methods over HTTP.

| URI | HTTP Method | Description |
| --- | --- | --- |
|/person/add | POST | Adds a person |
|/person/{id}/delete|GET|Delete the person with ‘id’ in the URI|
| /person/all | GET | Get all persons |
| /person/{id} | GET | Get the person with ‘id’ in the URI |

#### Libraries used in the App

**[Retrofit](https://square.github.io/retrofit/)** a type-safe HTTP client for Android and Java, developed by **[Square](https://square.github.io/)**, which turns your REST API into a Java interface.

**[Jackson](https://github.com/FasterXML/jackson)**, by FasterXML, a multi-purpose Java library for processing JSON data format. Jackson aims to be the best possible combination of fast, correct, lightweight, and ergonomic for developers.

**[JAXB](https://docs.oracle.com/javase/tutorial/jaxb/intro/index.html)** (Java Architecture for XML Binding) a software framework that allows Java developers to map Java classes to XML representations. It provides two main features: the ability to marshal Java objects into XML and the inverse, i.e. to unmarshal XML back into Java objects.
