package tp.poi.view;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import tp.poi.model.BuscadorPOI;

@SuppressWarnings("all")
public class PoiWindow extends MainWindow<BuscadorPOI> {
  public PoiWindow(final BuscadorPOI model) {
    super(model);
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Búsqueda de puntos de interés");
    Label _label = new Label(mainPanel);
    _label.setText("Criterio de búsqueda");
  }
}
