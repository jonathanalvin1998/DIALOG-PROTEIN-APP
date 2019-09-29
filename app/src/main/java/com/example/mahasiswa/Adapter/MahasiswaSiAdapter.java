package com.example.mahasiswa.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mahasiswa.Model.MahasiswaSI;
import com.example.mahasiswa.R;


import java.util.ArrayList;

public class MahasiswaSiAdapter extends RecyclerView.Adapter<MahasiswaSiAdapter.ViewHolder> {
    ArrayList<MahasiswaSI> dataList;
    public MahasiswaSiAdapter(ArrayList<MahasiswaSI> dataList) {
        this.dataList = dataList;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs_si,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder Mhs, int Position) {
        Mhs.txtNama.setText(dataList.get(Position).getNama());
        Mhs.txtNim.setText(dataList.get(Position).getNim());
        Mhs.txtCita.setText(dataList.get(Position).getCita2());
        Mhs.txtHobi.setText(dataList.get(Position).getHobi());
        Mhs.txtMoto.setText(dataList.get(Position).getMoto());
        Mhs.img.setImageResource(dataList.get(Position).getImg());
    }

    @Override
    public int getItemCount() {

        return (dataList !=null) ? dataList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama,txtNim,txtCita,txtHobi,txtMoto;
        private ImageView img;

        public ViewHolder(View view){
            super(view);
            txtNama = view.findViewById(R.id.txt_nama);
            txtNim = view.findViewById(R.id.txt_nim);
            txtCita = view.findViewById(R.id.txt_cita2);
            txtHobi = view.findViewById(R.id.txt_hobi);
            txtMoto = view.findViewById(R.id.txt_moto);
            img = view.findViewById(R.id.imageView);

        }
    }
}
