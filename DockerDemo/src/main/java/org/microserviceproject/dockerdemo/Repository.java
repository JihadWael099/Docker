package org.microserviceproject.dockerdemo;

import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<DemoEntity,Integer> {
}
