package com.practicag.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    //Este metodo devuelve el url de la imagen 
    public String cargaImagen(
            MultipartFile archivoLocalCliente,
            String carpeta,
            Long id
    );

    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "techshop-d82af.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-d82af-firebase-adminsdk-ppnfe-34a9808f51.json";
}
