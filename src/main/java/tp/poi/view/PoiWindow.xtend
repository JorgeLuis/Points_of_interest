package tp.poi.view

import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.MainWindow
import tp.poi.model.BuscadorPOI

class PoiWindow extends MainWindow<BuscadorPOI> {
	
	new(BuscadorPOI model) {
		super(model)
	}
	
	override createContents(Panel mainPanel) {
		this.title = "Búsqueda de puntos de interés"
		
		new Label(mainPanel).text = "Criterio de búsqueda"
		
	}
	
}