package ensa.ouissoune.bookstore.bootstrap;

import ensa.ouissoune.bookstore.entities.Publisher;
import ensa.ouissoune.bookstore.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;

public class BootstrapPublisher implements CommandLineRunner {

    private final PublisherRepository publisherRepository ;

    public BootstrapPublisher(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setPublisherName("ilyas");
        publisher.setAddress("maroc");
        publisher.setCity("fes");
        publisher.setState("chi blassa");
        publisher.setZip("30000");
        publisherRepository.save(publisher);
    }
}
