package com.example.demo.service;

import com.example.demo.entity.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien> getAll();

    void addSinhVien(SinhVien sinhVien);

    SinhVien detailSinhVien(String maSinhVien);

    void deletesinhVien(String maSinhVien);

    void updatesinhvien(String maSinhVien,SinhVien sinhVien);
}
