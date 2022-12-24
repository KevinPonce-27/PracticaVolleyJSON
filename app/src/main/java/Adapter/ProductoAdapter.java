package Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.kdpr.practicavolleyjson.R;

import java.util.List;

import Models.Producto;


public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>{
    private Context Ctx;
    private List<Producto> lstproductos;
    public ProductoAdapter(Context mCtx, List<Producto> productos) {
        this.lstproductos = productos;
        Ctx = mCtx;
    }
    @Override
    public ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.ly_product, null);
        return new ProductoViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ProductoViewHolder holder, int position) {
        Producto producto = lstproductos.get(position);
        holder.txtidproducto.setText(producto.getIdproduct());
        holder.txtcode.setText(producto.getCode());
        holder.txtprecio.setText(producto.getCosto());
        holder.txtpreciounit.setText(producto.getPreciounit());
        holder.txtpreciomayo.setText(producto.getPreciomayo());
        holder.txtcate.setText(producto.getCategoria());
        holder.txtscate.setText(producto.getSubcategoria());
        holder.txtdescrip.setText(producto.getDescripcion());
    }
    @Override
    public int getItemCount() {
        return lstproductos.size();
    }
    class ProductoViewHolder extends RecyclerView.ViewHolder {
        TextView txtidproducto,txtcode,txtprecio,txtpreciounit,txtpreciomayo,txtcate,txtscate,txtdescrip;
        public ProductoViewHolder(View itemView) {
            super(itemView);
            txtidproducto = itemView.findViewById(R.id.txtIDProducto);
            txtcode = itemView.findViewById(R.id.txtBarCode);
            txtprecio = itemView.findViewById(R.id.txtPrecio);
            txtpreciounit = itemView.findViewById(R.id.txtPrecioUnit);
            txtpreciomayo = itemView.findViewById(R.id.txtPrecioMayo);
            txtcate = itemView.findViewById(R.id.txtCategoria);
            txtscate = itemView.findViewById(R.id.txtSubCategoria);
            txtdescrip = itemView.findViewById(R.id.txtDescripcion);
        }
    }
}
