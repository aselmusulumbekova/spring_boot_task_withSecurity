package com.example.spring_boot_task_withsecurity.serviceImple.service;

import com.example.spring_boot_task_withsecurity.entity.Company;

import java.util.List;

public interface CompanyService {

    void saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(int id);

    void updateCompany(int id,Company company);

    void deleteCompanyById(int id);
}
