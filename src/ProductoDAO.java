import java.util.List;

public interface ProductoDAO {
    void agregarProducto(Producto producto);
    Producto obtenerProducto(int id);
    List<Producto> obtenerTodosLosProductos();
    void actualizarProducto(Producto producto);
    void eliminarProducto(int id);
}
