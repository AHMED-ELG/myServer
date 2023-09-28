package io.elg.server;

import io.elg.server.enumeration.Status;
import io.elg.server.model.Server;
import io.elg.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static io.elg.server.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null,"192.168.1.160", "Mac" ,"16 GB", "PC","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null,"192.168.1.58", "Linux" ,"16 GB", "PC","http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null,"192.168.1.21", "Fedora" ,"32 GB", "Mail server","http://localhost:8080/server/image/server3.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null,"192.168.1.14", "Red Hat" ,"64 GB", "server","http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	}

}
