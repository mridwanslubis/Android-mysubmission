package com.example.mysubmission

object SmartphonesData {

    private val smartphoneName = arrayOf(
        "Apple iPhone 11 Pro",
        "Oneplus 8 Pro",
        "Oneplus Nord",
        "Realme X2 Pro",
        "Samsung Galaxy A51",
        "Samsung Galaxy S20 Ultra",
        "Sony Xperia 1 Mark II",
        "Xiaomi Mi 10 Pro",
        "Xiaomi Poco X3 NFC",
        "Xiaomi Redmi Note 9 Pro")

    private val smartphoneMerk = arrayOf(
            "Apple",
            "Oneplus",
            "Oneplus",
            "Realme",
            "Samsung",
            "Samsung",
            "Sony",
            "Xiaomi",
            "Xiaomi",
            "Xiaomi")

    private val smartphoneImages = intArrayOf(
        R.drawable.apple_iphone_11_pro,
        R.drawable.oneplus_8_pro,
        R.drawable.oneplus_nord,
        R.drawable.realme_x2_pro,
        R.drawable.samsung_galaxy_a51,
        R.drawable.samsung_galaxy_s20_ultra,
        R.drawable.docomo,
        R.drawable.xiaomi_mi_10_pro,
        R.drawable.xiaomi_poco_x3_nfc,
        R.drawable.xiaomi_redmi_note_9_pro)

    val tanggalRilis = mapOf(
        "Apple iPhone 11 Pro" to "20 September 2019",
        "Oneplus 8 Pro" to "21 April 2020",
        "Oneplus Nord" to "4 Agustus 2020",
        "Realme X2 Pro" to "Oktober 2019",
        "Samsung Galaxy A51" to "16 Desember 2019",
        "Samsung Galaxy S20 Ultra" to "15 Maret 2020",
        "Sony Xperia 1 Mark II" to "22 Mei 2020",
        "Xiaomi Mi 10 Pro" to "18 Februari 2020",
        "Xiaomi Poco X3 NFC" to "8 September 2020",
        "Xiaomi Redmi Note 9 Pro" to "5 Mei 2020"

    )

    val typeDisplay = mapOf(
        "Apple iPhone 11 Pro" to "Super Retina XDR OLED",
        "Oneplus 8 Pro" to "Fluid AMOLED, 1B colors, 120Hz, HDR10+",
        "Oneplus Nord" to "Fluid AMOLED, 90Hz, HDR10+",
        "Realme X2 Pro" to "Super AMOLED, 90Hz, HDR10+",
        "Samsung Galaxy A51" to "Super AMOLED",
        "Samsung Galaxy S20 Ultra" to "Dynamic AMOLED 2X, 120Hz, HDR10+",
        "Sony Xperia 1 Mark II" to "OLED, 1B colors, HDR BT.2020",
        "Xiaomi Mi 10 Pro" to "Super AMOLED, 90Hz, HDR10+",
        "Xiaomi Poco X3 NFC" to "IPS LCD, 120Hz, HDR10",
        "Xiaomi Redmi Note 9 Pro" to "IPS LCD"

    )

    val resolusiDisplay = mapOf(
        "Apple iPhone 11 Pro" to "1125 x 2436 pixels, 19.5:9 ratio",
        "Oneplus 8 Pro" to "1440 x 3168 pixels",
        "Oneplus Nord" to "1080 x 2400 pixels, 20:9 ratio",
        "Realme X2 Pro" to "1080 x 2400 pixels, 20:9 ratio",
        "Samsung Galaxy A51" to "1080 x 2400 pixels, 20:9 ratio",
        "Samsung Galaxy S20 Ultra" to "1440 x 3200 pixels, 20:9 ratio",
        "Sony Xperia 1 Mark II" to "1644 x 3840 pixels, 21:9 ratio",
        "Xiaomi Mi 10 Pro" to "1080 x 2340 pixels, 19.5:9 ratio",
        "Xiaomi Poco X3 NFC" to "1080 x 2400 pixels, 20:9 ratio",
        "Xiaomi Redmi Note 9 Pro" to "1080 x 2400 pixels, 20:9 ratio"

    )

    val chipsetPlatform = mapOf(
        "Apple iPhone 11 Pro" to "Apple A13 Bionic",
        "Oneplus 8 Pro" to "Qualcomm SM8250 Snapdragon 865 (7 nm+)",
        "Oneplus Nord" to "Qualcomm SM7250 Snapdragon 765G (7 nm)",
        "Realme X2 Pro" to "Qualcomm SM8150 Snapdragon 855+ (7 nm)",
        "Samsung Galaxy A51" to "Exynos 9611 (10nm)",
        "Samsung Galaxy S20 Ultra" to "Exynos 990 (7 nm+), Qualcomm SM8250 Snapdragon 865 (7 nm+)",
        "Sony Xperia 1 Mark II" to "Qualcomm SM8250 Snapdragon 865 (7 nm+)",
        "Xiaomi Mi 10 Pro" to "Qualcomm SM8250 Snapdragon 865 (7 nm+)",
        "Xiaomi Poco X3 NFC" to "Qualcomm SM7150-AC Snapdragon 732G (8 nm)",
        "Xiaomi Redmi Note 9 Pro" to "Qualcomm SM7125 Snapdragon 720G (8 nm)"

    )

    val cpuPlatform = mapOf(
        "Apple iPhone 11 Pro" to "Hexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)",
        "Oneplus 8 Pro" to "Octa-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.8 GHz Kryo 585)",
        "Oneplus Nord" to "Octa-core (1x2.4 GHz Kryo 475 Prime & 1x2.2 GHz Kryo 475 Gold & 6x1.8 GHz Kryo 475 Silver)",
        "Realme X2 Pro" to "Octa-core (1x2.96 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.8 GHz Kryo 485)",
        "Samsung Galaxy A51" to "Octa-core (4x2.3 GHz Cortex-A73 & 4x1.7 GHz Cortex-A53)",
        "Samsung Galaxy S20 Ultra" to "Octa-core (2x2.73 GHz Mongoose M5 & 2x2.50 GHz Cortex-A76 & 4x2.0 GHz Cortex-A55)",
        "Sony Xperia 1 Mark II" to "Octa-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.8 GHz Kryo 585)",
        "Xiaomi Mi 10 Pro" to "Octa-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.80 GHz Kryo 585)",
        "Xiaomi Poco X3 NFC" to "Octa-core (2x2.3 GHz Kryo 470 Gold & 6x1.8 GHz Kryo 470 Silver)",
        "Xiaomi Redmi Note 9 Pro" to "Octa-core (2x2.3 GHz Kryo 465 Gold & 6x1.8 GHz Kryo 465 Silver)"
    )

    val gpuPlatform = mapOf(
        "Apple iPhone 11 Pro" to "Apple GPU (4-core graphics)",
        "Oneplus 8 Pro" to "Adreno 650",
        "Oneplus Nord" to "Adreno 620",
        "Realme X2 Pro" to "Adreno 640",
        "Samsung Galaxy A51" to "Mali-G72",
        "Samsung Galaxy S20 Ultra" to "Mali-G77 MP11",
        "Sony Xperia 1 Mark II" to "Adreno 650",
        "Xiaomi Mi 10 Pro" to "Adreno 650",
        "Xiaomi Poco X3 NFC" to "Adreno 618",
        "Xiaomi Redmi Note 9 Pro" to "Adreno 618"
    )

    val cardSlotMemory = mapOf(
        "Apple iPhone 11 Pro" to "No",
        "Oneplus 8 Pro" to "No",
        "Oneplus Nord" to "No",
        "Realme X2 Pro" to "No",
        "Samsung Galaxy A51" to "microSDXC (dedicated slot)",
        "Samsung Galaxy S20 Ultra" to "microSDXC (uses shared SIM slot)",
        "Sony Xperia 1 Mark II" to "microSDXC (uses shared SIM slot)",
        "Xiaomi Mi 10 Pro" to "No",
        "Xiaomi Poco X3 NFC" to "microSDXC (uses shared SIM slot)",
        "Xiaomi Redmi Note 9 Pro" to "microSDXC (dedicated slot)"
    )

    val internalMemory= mapOf(
        "Apple iPhone 11 Pro" to "64GB 4GB RAM, 256GB 4GB RAM, 512GB 4GB RAM",
        "Oneplus 8 Pro" to "28GB 8GB RAM, 256GB 12GB RAM",
        "Oneplus Nord" to "64GB 6GB RAM, 128GB 8GB RAM, 256GB 12GB RAM",
        "Realme X2 Pro" to "64GB 6GB RAM, 128GB 8GB RAM, 256GB 8GB RAM, 256GB 12GB RAM",
        "Samsung Galaxy A51" to "64GB 4GB RAM, 128GB 4GB RAM, 128GB 6GB RAM, 128GB 8GB RAM, 256GB 8GB RAM",
        "Samsung Galaxy S20 Ultra" to "128GB 12GB RAM",
        "Sony Xperia 1 Mark II" to "256GB 8GB RAM, 256GB 12GB RAM",
        "Xiaomi Mi 10 Pro" to "256GB 8GB RAM, 256GB 12GB RAM, 512GB 12GB RAM",
        "Xiaomi Poco X3 NFC" to "64GB 6GB RAM, 128GB 6GB RAM, 128GB 8GB RAM",
        "Xiaomi Redmi Note 9 Pro" to "64GB 6GB RAM, 128GB 6GB RAM, 128GB 8GB RAM"
    )



    val listData: ArrayList<Smartphone>
    get() {
        val list = arrayListOf<Smartphone>()
        for (position in smartphoneName.indices){
            val smartphone = Smartphone()
            smartphone.name = smartphoneName[position]
            smartphone.photo = smartphoneImages[position]
            smartphone.merk = smartphoneMerk[position]
            list.add(smartphone)
        }
        return list
    }


}