package com.gptlibs.fullstackgptlibs.repositories;

import com.gptlibs.fullstackgptlibs.models.MadLib;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MadLibRepo extends JpaRepository<MadLib, Long> {
    MadLib findByUserId(long user_id);
}
