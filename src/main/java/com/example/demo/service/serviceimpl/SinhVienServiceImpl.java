package com.example.demo.service.serviceimpl;

import com.example.demo.entity.SinhVien;
import com.example.demo.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService{

    private ArrayList<SinhVien> listsinhVien = new ArrayList<>();

    public SinhVienServiceImpl(){
        listsinhVien.add(new SinhVien("Ph123", "Nguyen Van A", 12, "Ha Noi", false));
        listsinhVien.add(new SinhVien("Ph123", "Nguyen Van A", 12, "Ha Noi", false));
        listsinhVien.add(new SinhVien("Ph123", "Nguyen Van A", 12, "Ha Noi", false));
        listsinhVien.add(new SinhVien("Ph123", "Nguyen Van A", 12, "Ha Noi", false));
    }


    @Override
    public List<SinhVien> getAll() {
        return listsinhVien;
    }

    @Override
    public void addSinhVien(SinhVien sinhVien) {
        listsinhVien.add(sinhVien);
    }

    @Override
    public SinhVien detailSinhVien(String maSinhVien) {
        for (int i = 0; i < listsinhVien.size(); i++) {
            if(listsinhVien.get(i).getMaSinhVien().equalsIgnoreCase(maSinhVien)){
                return listsinhVien.get(i);
            }
        }
        return null;
    }

    @Override
    public void deletesinhVien(String maSinhVien) {
        for (int i = 0; i < listsinhVien.size(); i++) {
            if(listsinhVien.get(i).getMaSinhVien().equalsIgnoreCase(maSinhVien)){
                listsinhVien.remove(i);
                break;
            }
        }

    }

    @Override
    public void updatesinhvien(String maSinhVien, SinhVien sinhVien) {
        for (SinhVien sv : listsinhVien){
            if (sv.getMaSinhVien().equals(maSinhVien)){
                sv.setHoTen(sinhVien.getHoTen());
                sv.setTuoi(sinhVien.getTuoi());
                sv.setDiaChi(sinhVien.getDiaChi());
                sv.setGioiTinh(sinhVien.getGioiTinh());
            }
        }
    }
}
