package com.mkce.springbootbasics;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Vaccine, Long> {

}
