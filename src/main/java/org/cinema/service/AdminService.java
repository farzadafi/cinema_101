package org.cinema.service;

import org.cinema.repository.AdminRepository;

public class AdminService {
    private AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
}
