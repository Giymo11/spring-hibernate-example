# Spring + JPA + JavaFX

This is just a simple example to explore how Spring 5.0 works.

When the program is executed:
0. All classes are annotated to be managed by Spring (@Component, @Service, etc)
0. The SpringContext is generated (as well as all the Repositories, etc)
0. The FxmlLoader uses this context as the controller factory
0. The UI fxml is loaded, where the controller is specified
0. The Spring context automatically injects the dependencies



