package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SinhVien {

    private String maSinhVien;

    private String hoTen;

    private int tuoi;

    private String diaChi;

    private Boolean gioiTinh;
}
