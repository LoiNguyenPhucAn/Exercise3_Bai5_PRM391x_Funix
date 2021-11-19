package com.example.cunghoangdao;

import static com.example.cunghoangdao.R.drawable.ic_bach_duong;
import static com.example.cunghoangdao.R.drawable.ic_bao_binh;
import static com.example.cunghoangdao.R.drawable.ic_bocap;
import static com.example.cunghoangdao.R.drawable.ic_cu_giai;
import static com.example.cunghoangdao.R.drawable.ic_kim_nguu;
import static com.example.cunghoangdao.R.drawable.ic_ma_ket;
import static com.example.cunghoangdao.R.drawable.ic_nhan_ma;
import static com.example.cunghoangdao.R.drawable.ic_song_ngu;
import static com.example.cunghoangdao.R.drawable.ic_song_tu;
import static com.example.cunghoangdao.R.drawable.ic_su_tu;
import static com.example.cunghoangdao.R.drawable.ic_thien_binh;
import static com.example.cunghoangdao.R.drawable.ic_xu_nu;
import static com.example.cunghoangdao.R.id.btnXemThem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_DATA_CODE = "main";
    private static final int BOCAP = 1;
    private static final int XUNU = 2;
    private static final int THIENBINH = 3;
    private static final int BAOBINH = 4;
    private static final int KIMNGUU = 5;
    private static final int MAKET = 6;
    private static final int NHANMA = 7;
    private static final int SONGNGU = 8;
    private static final int BACHDUONG = 9;
    private static final int CUGIAI = 10;
    private static final int SONGTU = 11;
    private static final int SUTU = 12;

    private static final int TEXT_REQUEST = 1;


    Button btnDetail;
    ImageView ivBoCap, ivXuNu, ivThienBinh, ivBaoBinh, ivKimNguu, ivMaket, ivNhanMa, ivSongNgu, ivBachDuong, ivCuGiai, ivSongTu, ivSutu;
    ImageView ivTitle2;
    TextView tvTitle2, tvAbstracts;

    int signal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // sử dụng import static com.example.cunghoangdao.R.id.btnXemThem; để thay thế cho R.id.btnXemThem
        btnDetail = findViewById(btnXemThem);

        tvTitle2 = findViewById(R.id.tvTitle2);
        tvAbstracts = findViewById(R.id.tvAbstracts);
        ivTitle2 = findViewById(R.id.ivTitle2);


        ivBachDuong = findViewById(R.id.ivBachDuong);
        ivBoCap = findViewById(R.id.ivBoCap);
        ivXuNu = findViewById(R.id.ivXuNu);
        ivThienBinh = findViewById(R.id.ivThienBinh);
        ivBaoBinh = findViewById(R.id.ivBaoBinh);
        ivKimNguu = findViewById(R.id.ivKimNguu);
        ivMaket = findViewById(R.id.ivMaKet);
        ivNhanMa = findViewById(R.id.ivNhanMa);
        ivSongNgu = findViewById(R.id.ivSongNgu);
        ivSongTu = findViewById(R.id.ivSongTu);
        ivSutu = findViewById(R.id.ivSutu);
        ivCuGiai = findViewById(R.id.ivCuGiai);

        signal = BOCAP;

        btnDetail.setOnClickListener(this);
        ivBachDuong.setOnClickListener(this);
        ivBoCap.setOnClickListener(this);
        ivXuNu.setOnClickListener(this);
        ivThienBinh.setOnClickListener(this);
        ivBaoBinh.setOnClickListener(this);
        ivKimNguu.setOnClickListener(this);
        ivMaket.setOnClickListener(this);
        ivNhanMa.setOnClickListener(this);
        ivSongNgu.setOnClickListener(this);
        ivSongTu.setOnClickListener(this);
        ivSutu.setOnClickListener(this);
        ivCuGiai.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
//        Drawable icTitle2;
        String titleString, abstractsString;
        if (view.getId() == btnXemThem) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,DetailActivity.class);
            intent.putExtra(EXTRA_DATA_CODE,signal);
            startActivity(intent);
        } else {
            switch (view.getId()) {
                case R.id.ivBoCap:
//                icTitle2 = getDrawable(ic_bocap);
//                ivTitle2.setImageDrawable(icTitle2);
                    ivTitle2.setImageResource(ic_bocap);
                    tvTitle2.setText(R.string.bo_cap_title2);
                    tvAbstracts.setText(R.string.bo_cap_text);
                    signal=BOCAP;
                    break;
                case R.id.ivBachDuong:
//                icTitle2 = getDrawable(ic_bach_duong);
//                ivTitle2.setImageDrawable(icTitle2);
                    ivTitle2.setImageResource(ic_bach_duong);
                    tvTitle2.setText(R.string.bach_duong_title2);
                    tvAbstracts.setText(R.string.bach_duong_text);
                    signal=BACHDUONG;
                    break;
                case R.id.ivBaoBinh:
                    ivTitle2.setImageResource(ic_bao_binh);
                    tvTitle2.setText(R.string.bao_binh_title2);
                    tvAbstracts.setText(R.string.bao_binh_text);
                    signal=BAOBINH;
                    break;
                case R.id.ivThienBinh:
                    ivTitle2.setImageResource(ic_thien_binh);
                    tvTitle2.setText(R.string.thien_binh_title2);
                    tvAbstracts.setText(R.string.thien_binh_text);
                    signal=THIENBINH;
                    break;
                case R.id.ivSongNgu:
                    ivTitle2.setImageResource(ic_song_ngu);
                    tvTitle2.setText(R.string.song_ngu_title2);
                    tvAbstracts.setText(R.string.song_ngu_text);
                    signal=SONGNGU;
                    break;
                case R.id.ivSongTu:
                    ivTitle2.setImageResource(ic_song_tu);
                    tvTitle2.setText(R.string.song_tu_title2);
                    tvAbstracts.setText(R.string.song_tu_text);
                    signal=SONGTU;
                    break;
                case R.id.ivXuNu:
//                icTitle2 = getDrawable(ic_xu_nu);
//                ivTitle2.setImageDrawable(icTitle2);
                    ivTitle2.setImageResource(ic_xu_nu);
                    tvTitle2.setText(R.string.xu_nu_title2);
                    tvAbstracts.setText(R.string.xu_nu_text);
                    signal=XUNU;
                    break;
                case R.id.ivMaKet:
                    ivTitle2.setImageResource(ic_ma_ket);
                    tvTitle2.setText(R.string.ma_ket_title2);
                    tvAbstracts.setText(R.string.ma_ket_text);
                    signal=MAKET;
                    break;
                case R.id.ivNhanMa:
                    ivTitle2.setImageResource(ic_nhan_ma);
                    tvTitle2.setText(R.string.nhan_ma_title2);
                    tvAbstracts.setText(R.string.nhan_ma_text);
                    signal=NHANMA;
                    break;
                case R.id.ivSutu:
                    ivTitle2.setImageResource(ic_su_tu);
                    tvTitle2.setText(R.string.su_tu_title2);
                    tvAbstracts.setText(R.string.su_tu_text);
                    signal=SUTU;
                    break;
                case R.id.ivCuGiai:
                    ivTitle2.setImageResource(ic_cu_giai);
                    tvTitle2.setText(R.string.cu_giai_title2);
                    tvAbstracts.setText(R.string.cu_giai_text);
                    signal=CUGIAI;
                    break;
                case R.id.ivKimNguu:
                    ivTitle2.setImageResource(ic_kim_nguu);
                    tvTitle2.setText(R.string.kim_nguu_title2);
                    tvAbstracts.setText(R.string.kim_nguu_text);
                    signal=KIMNGUU;
                    break;
            }
        }

    }
}