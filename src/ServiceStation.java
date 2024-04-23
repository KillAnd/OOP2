public class ServiceStation {
    public void check(Transport transport) {
            System.out.println("Обслуживаем " + transport.getModelName());
            if (transport.getWheelsCount() == 2 ) {
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    transport.updateTyre();
                }
            } else if (transport.getWheelsCount() == 4) {
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    transport.updateTyre();
                }
                transport.checkEngine();
            }  else {
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    transport.updateTyre();
                }
                transport.checkEngine();
                transport.checkTrailer();
            }
        }
    }
