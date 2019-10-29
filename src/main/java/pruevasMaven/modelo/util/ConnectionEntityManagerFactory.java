package pruevasMaven.modelo.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionEntityManagerFactory {

		private static EntityManagerFactory entityManagerFactory = null;
		
		private ConnectionEntityManagerFactory() {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("com.david.pruebasMaven.H2");
		}

		public static EntityManagerFactory getEntityManagerFactory() {

			if(entityManagerFactory == null) {
				
				new ConnectionEntityManagerFactory();
			}
			return entityManagerFactory;
		}
}
