package com.example.demo.controller;

import com.example.demo.entity.SinhVien;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    private List<SinhVien> listsinhVien;

    @GetMapping("/sinh-vien/hien-thi")
    public String hienthiThongTin(Model model){
        listsinhVien = sinhVienService.getAll();
        model.addAttribute("lists", listsinhVien);
        return "sinhviens";
    }

    @GetMapping("/sinh-vien/detail/{id1}")
    public String viewUpdate(@PathVariable("ma") String ma, Model model){
        SinhVien sinhVien = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sinhVien1", sinhVien);
        return "detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/view-update/{ma}")
    public String Update(@PathVariable("ma") String ma, Model model){
        SinhVien sinhVien = sinhVienService.detailSinhVien(ma);
        model.addAttribute("sinhVien", sinhVien);
        return "update-sinh-vien";
    }

    @GetMapping("/sinh-vien/remove/{ma}")
    public String remove(@PathVariable("ma") String ma, Model model){
        sinhVienService.deletesinhVien(ma);
        return "redirect:/sinh-vien/hien-thi";

    }

    @PostMapping("/sinh-vien/add")
    public String add(@RequestParam("maSinhVien") String maSinhVien,
                      @RequestParam("hoTen") String hoTen,
                      @RequestParam("tuoi") String tuoi,
                      @RequestParam("diaChi") String diaChi,
                      @RequestParam("gioiTinh") String gioiTinh){
        SinhVien sinhVien = SinhVien.builder()
                .diaChi(diaChi)
                .maSinhVien(maSinhVien)
                .gioiTinh(Boolean.valueOf(gioiTinh))
                .hoTen(hoTen)
                .tuoi(Integer.valueOf(tuoi))
                .build();
        sinhVienService.addSinhVien(sinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }
}
