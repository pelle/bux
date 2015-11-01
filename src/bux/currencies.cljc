(ns bux.currencies)

(def currencies
  [{:symbol "р.", :subunit "Kopek", :iso-numeric "643", :html-entity "&#x0440;&#x0443;&#x0431;", :decimal-points 2, :name "Russian Ruble", :iso-code "RUB", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Sen", :iso-numeric "096", :html-entity "$", :decimal-points 2, :name "Brunei Dollar", :iso-code "BND", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "554", :html-entity "$", :decimal-points 2, :name "New Zealand Dollar", :iso-code "NZD", :symbol-first true, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "976", :html-entity "", :decimal-points 2, :name "Congolese Franc", :iso-code "CDF", :symbol-first false, :priority 100}
   {:symbol "zł", :subunit "Grosz", :iso-numeric "985", :html-entity "", :decimal-points 2, :name "Polish Złoty", :iso-code "PLN", :symbol-first false, :priority 100}
   {:symbol "T", :subunit "Sene", :iso-numeric "882", :html-entity "", :decimal-points 2, :name "Samoan Tala", :iso-code "WST", :symbol-first false, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "108", :html-entity "", :decimal-points 2, :name "Burundian Franc", :iso-code "BIF", :symbol-first false, :priority 100}
   {:symbol "৳", :subunit "Paisa", :iso-numeric "050", :html-entity "", :decimal-points 2, :name "Bangladeshi Taka", :iso-code "BDT", :symbol-first true, :priority 100}
   {:symbol "ZK", :subunit "Ngwee", :iso-numeric "894", :html-entity "", :decimal-points 2, :name "Zambian Kwacha", :iso-code "ZMK", :symbol-first false, :priority 100}
   {:symbol "₫", :subunit "Hào", :iso-numeric "704", :html-entity "&#x20AB;", :decimal-points 1, :name "Vietnamese Đồng", :iso-code "VND", :symbol-first true, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "646", :html-entity "", :decimal-points 2, :name "Rwandan Franc", :iso-code "RWF", :symbol-first false, :priority 100}
   {:symbol "R", :subunit "Cent", :iso-numeric "710", :html-entity "&#x0052;", :decimal-points 2, :name "South African Rand", :iso-code "ZAR", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "901", :html-entity "$", :decimal-points 2, :name "New Taiwan Dollar", :iso-code "TWD", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "344", :html-entity "$", :decimal-points 2, :name "Hong Kong Dollar", :iso-code "HKD", :symbol-first true, :priority 100}
   {:symbol "₭", :subunit "Att", :iso-numeric "418", :html-entity "&#x20AD;", :decimal-points 2, :name "Lao Kip", :iso-code "LAK", :symbol-first false, :priority 100}
   {:symbol "Bs F", :subunit "Céntimo", :iso-numeric "937", :html-entity "", :decimal-points 2, :name "Venezuelan Bolívar", :iso-code "VEF", :symbol-first true, :priority 100}
   {:symbol "Sh", :subunit "Cent", :iso-numeric "834", :html-entity "", :decimal-points 2, :name "Tanzanian Shilling", :iso-code "TZS", :symbol-first true, :priority 100}
   {:symbol "د.إ", :subunit "Fils", :iso-numeric "784", :html-entity "", :decimal-points 2, :name "United Arab Emirates Dirham", :iso-code "AED", :symbol-first true, :priority 100}
   {:symbol "Sh", :subunit "Cent", :iso-numeric "706", :html-entity "", :decimal-points 2, :name "Somali Shilling", :iso-code "SOS", :symbol-first false, :priority 100}
   {:symbol "Vt", :subunit nil, :iso-numeric "548", :html-entity "", :decimal-points 0, :name "Vanuatu Vatu", :iso-code "VUV", :symbol-first true, :priority 100}
   {:symbol nil, :subunit "Tyiyn", :iso-numeric "417", :html-entity "", :decimal-points 2, :name "Kyrgyzstani Som", :iso-code "KGS", :symbol-first false, :priority 100}
   {:symbol "د.ت", :subunit "Millime", :iso-numeric "788", :html-entity "", :decimal-points 3, :name "Tunisian Dinar", :iso-code "TND", :symbol-first false, :priority 100}
   {:symbol "C$", :subunit "Centavo", :iso-numeric "558", :html-entity "", :decimal-points 2, :name "Nicaraguan Córdoba", :iso-code "NIO", :symbol-first false, :priority 100}
   {:symbol "din. or дин.", :subunit "Para", :iso-numeric "941", :html-entity "", :decimal-points 2, :name "Serbian Dinar", :iso-code "RSD", :symbol-first true, :priority 100}
   {:symbol "m", :subunit "Tennesi", :iso-numeric "795", :html-entity "", :decimal-points 2, :name "Turkmenistani Manat", :iso-code "TMM", :symbol-first false, :priority 100}
   {:symbol "€", :subunit "Cent", :iso-numeric "978", :html-entity "&#x20AC;", :decimal-points 2, :name "Euro", :iso-code "EUR", :symbol-first false, :priority 2}
   {:symbol "B/.", :subunit "Centésimo", :iso-numeric "590", :html-entity "", :decimal-points 2, :name "Panamanian Balboa", :iso-code "PAB", :symbol-first false, :priority 100}
   {:symbol "Br", :subunit "Kapyeyka", :iso-numeric "974", :html-entity "", :decimal-points 2, :name "Belarusian Ruble", :iso-code "BYR", :symbol-first false, :priority 100}
   {:symbol "₴", :subunit "Kopiyka", :iso-numeric "980", :html-entity "&#x20B4", :decimal-points 2, :name "Ukrainian Hryvnia", :iso-code "UAH", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "124", :html-entity "$", :decimal-points 2, :name "Canadian Dollar", :iso-code "CAD", :symbol-first true, :priority 5}
   {:symbol "RM", :subunit "Sen", :iso-numeric "458", :html-entity "", :decimal-points 2, :name "Malaysian Ringgit", :iso-code "MYR", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "516", :html-entity "$", :decimal-points 2, :name "Namibian Dollar", :iso-code "NAD", :symbol-first false, :priority 100}
   {:symbol nil, :subunit "Chertrum", :iso-numeric "064", :html-entity "", :decimal-points 2, :name "Bhutanese Ngultrum", :iso-code "BTN", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "702", :html-entity "$", :decimal-points 2, :name "Singapore Dollar", :iso-code "SGD", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "716", :html-entity "$", :decimal-points 2, :name "Zimbabwean Dollar", :iso-code "ZWD", :symbol-first true, :priority 100}
   {:symbol "kr", :subunit "Øre", :iso-numeric "208", :html-entity "", :decimal-points 2, :name "Danish Krone", :iso-code "DKK", :symbol-first false, :priority 100}
   {:symbol "Sk", :subunit "Halier", :iso-numeric "703", :html-entity "", :decimal-points 2, :name "Slovak Koruna", :iso-code "SKK", :symbol-first true, :priority 100}
   {:symbol "ب.د", :subunit "Fils", :iso-numeric "048", :html-entity "", :decimal-points 3, :name "Bahraini Dinar", :iso-code "BHD", :symbol-first true, :priority 100}
   {:symbol nil, :subunit "Santim", :iso-numeric "230", :html-entity "", :decimal-points 2, :name "Ethiopian Birr", :iso-code "ETB", :symbol-first false, :priority 100}
   {:symbol "Ft", :subunit "Fillér", :iso-numeric "348", :html-entity "", :decimal-points 2, :name "Hungarian Forint", :iso-code "HUF", :symbol-first false, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "174", :html-entity "", :decimal-points 2, :name "Comorian Franc", :iso-code "KMF", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "060", :html-entity "$", :decimal-points 2, :name "Bermudian Dollar", :iso-code "BMD", :symbol-first true, :priority 100}
   {:symbol "د.ك", :subunit "Fils", :iso-numeric "414", :html-entity "", :decimal-points 3, :name "Kuwaiti Dinar", :iso-code "KWD", :symbol-first true, :priority 100}
   {:symbol "L", :subunit "Sente", :iso-numeric "426", :html-entity "", :decimal-points 2, :name "Lesotho Loti", :iso-code "LSL", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Centavo", :iso-numeric "214", :html-entity "&#x20B1;", :decimal-points 2, :name "Dominican Peso", :iso-code "DOP", :symbol-first true, :priority 100}
   {:symbol "₱", :subunit "Centavo", :iso-numeric "608", :html-entity "&#x20B1;", :decimal-points 2, :name "Philippine Peso", :iso-code "PHP", :symbol-first false, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "324", :html-entity "", :decimal-points 2, :name "Guinean Franc", :iso-code "GNF", :symbol-first false, :priority 100}
   {:symbol "£", :subunit "Piastre", :iso-numeric "938", :html-entity "", :decimal-points 2, :name "Sudanese Pound", :iso-code "SDG", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "084", :html-entity "$", :decimal-points 2, :name "Belize Dollar", :iso-code "BZD", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "136", :html-entity "$", :decimal-points 2, :name "Cayman Islands Dollar", :iso-code "KYD", :symbol-first true, :priority 100}
   {:symbol "MTn", :subunit "Centavo", :iso-numeric "943", :html-entity "", :decimal-points 2, :name "Mozambican Metical", :iso-code "MZN", :symbol-first true, :priority 100}
   {:symbol "Nfk", :subunit "Cent", :iso-numeric "232", :html-entity "", :decimal-points 2, :name "Eritrean Nakfa", :iso-code "ERN", :symbol-first false, :priority 100}
   {:symbol "₡", :subunit "Centavo", :iso-numeric "222", :html-entity "&#x20A1;", :decimal-points 2, :name "Salvadoran Colón", :iso-code "SVC", :symbol-first true, :priority 100}
   {:symbol "Rp", :subunit "Sen", :iso-numeric "360", :html-entity "", :decimal-points 2, :name "Indonesian Rupiah", :iso-code "IDR", :symbol-first true, :priority 100}
   {:symbol "£ or ج.م", :subunit "Piastre", :iso-numeric "818", :html-entity "&#x00A3;", :decimal-points 2, :name "Egyptian Pound", :iso-code "EGP", :symbol-first true, :priority 100}
   {:symbol "KM or КМ", :subunit "Fening", :iso-numeric "977", :html-entity "", :decimal-points 2, :name "Bosnia and Herzegovina Convertible Mark", :iso-code "BAM", :symbol-first true, :priority 100}
   {:symbol "د.ج", :subunit "Centime", :iso-numeric "012", :html-entity "", :decimal-points 2, :name "Algerian Dinar", :iso-code "DZD", :symbol-first false, :priority 100}
   {:symbol "P", :subunit "Avo", :iso-numeric "446", :html-entity "", :decimal-points 2, :name "Macanese Pataca", :iso-code "MOP", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Centavo", :iso-numeric "032", :html-entity "&#x20B1;", :decimal-points 2, :name "Argentine Peso", :iso-code "ARS", :symbol-first true, :priority 100}
   {:symbol "ر.ق", :subunit "Dirham", :iso-numeric "634", :html-entity "&#xFDFC;", :decimal-points 2, :name "Qatari Riyal", :iso-code "QAR", :symbol-first false, :priority 100}
   {:symbol "Bs.", :subunit "Centavo", :iso-numeric "068", :html-entity "", :decimal-points 2, :name "Bolivian Boliviano", :iso-code "BOB", :symbol-first true, :priority 100}
   {:symbol "៛", :subunit "Sen", :iso-numeric "116", :html-entity "&#x17DB;", :decimal-points 2, :name "Cambodian Riel", :iso-code "KHR", :symbol-first false, :priority 100}
   {:symbol "L", :subunit "Ban", :iso-numeric "498", :html-entity "", :decimal-points 2, :name "Moldovan Leu", :iso-code "MDL", :symbol-first false, :priority 100}
   {:symbol "ع.د", :subunit "Fils", :iso-numeric "368", :html-entity "", :decimal-points 3, :name "Iraqi Dinar", :iso-code "IQD", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Centavo", :iso-numeric "931", :html-entity "", :decimal-points 2, :name "Cuban Convertible Peso", :iso-code "CUC", :symbol-first false, :priority 100}
   {:symbol "﷼", :subunit "Fils", :iso-numeric "886", :html-entity "&#xFDFC;", :decimal-points 2, :name "Yemeni Rial", :iso-code "YER", :symbol-first false, :priority 100}
   {:symbol "G", :subunit "Centime", :iso-numeric "332", :html-entity "", :decimal-points 2, :name "Haitian Gourde", :iso-code "HTG", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "036", :html-entity "$", :decimal-points 2, :name "Australian Dollar", :iso-code "AUD", :symbol-first true, :priority 4}
   {:symbol "ƒ", :subunit "Cent", :iso-numeric "532", :html-entity "&#x0192;", :decimal-points 2, :name "Netherlands Antillean Gulden", :iso-code "ANG", :symbol-first true, :priority 100}
   {:symbol "₪", :subunit "Agora", :iso-numeric "376", :html-entity "&#x20AA;", :decimal-points 2, :name "Israeli New Sheqel", :iso-code "ILS", :symbol-first true, :priority 100}
   {:symbol "ЅМ", :subunit "Diram", :iso-numeric "972", :html-entity "", :decimal-points 2, :name "Tajikistani Somoni", :iso-code "TJS", :symbol-first false, :priority 100}
   {:symbol "ر.س", :subunit "Hallallah", :iso-numeric "682", :html-entity "&#xFDFC;", :decimal-points 2, :name "Saudi Riyal", :iso-code "SAR", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "780", :html-entity "$", :decimal-points 2, :name "Trinidad and Tobago Dollar", :iso-code "TTD", :symbol-first false, :priority 100}
   {:symbol "kr", :subunit "Öre", :iso-numeric "752", :html-entity "", :decimal-points 2, :name "Swedish Krona", :iso-code "SEK", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Centavo", :iso-numeric "192", :html-entity "&#x20B1;", :decimal-points 2, :name "Cuban Peso", :iso-code "CUP", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "044", :html-entity "$", :decimal-points 2, :name "Bahamian Dollar", :iso-code "BSD", :symbol-first true, :priority 100}
   {:symbol "Lt", :subunit "Centas", :iso-numeric "440", :html-entity "", :decimal-points 2, :name "Lithuanian Litas", :iso-code "LTL", :symbol-first false, :priority 100}
   {:symbol "Le", :subunit "Cent", :iso-numeric "694", :html-entity "", :decimal-points 2, :name "Sierra Leonean Leone", :iso-code "SLL", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "951", :html-entity "$", :decimal-points 2, :name "East Caribbean Dollar", :iso-code "XCD", :symbol-first true, :priority 100}
   {:symbol "D", :subunit "Butut", :iso-numeric "270", :html-entity "", :decimal-points 2, :name "Gambian Dalasi", :iso-code "GMD", :symbol-first false, :priority 100}
   {:symbol "Sh", :subunit "Cent", :iso-numeric "404", :html-entity "", :decimal-points 2, :name "Kenyan Shilling", :iso-code "KES", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "328", :html-entity "$", :decimal-points 2, :name "Guyanese Dollar", :iso-code "GYD", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "968", :html-entity "", :decimal-points 2, :name "Surinamese Dollar", :iso-code "SRD", :symbol-first false, :priority 100}
   {:symbol "〒", :subunit "Tiyn", :iso-numeric "398", :html-entity "", :decimal-points 2, :name "Kazakhstani Tenge", :iso-code "KZT", :symbol-first false, :priority 100}
   {:symbol "د.ا", :subunit "Piastre", :iso-numeric "400", :html-entity "", :decimal-points 2, :name "Jordanian Dinar", :iso-code "JOD", :symbol-first true, :priority 100}
   {:symbol "L", :subunit "Cent", :iso-numeric "748", :html-entity "", :decimal-points 2, :name "Swazi Lilangeni", :iso-code "SZL", :symbol-first true, :priority 100}
   {:symbol "₵", :subunit "Pesewa", :iso-numeric "936", :html-entity "&#x20B5;", :decimal-points 2, :name "Ghanaian Cedi", :iso-code "GHS", :symbol-first true, :priority 100}
   {:symbol "₩", :subunit "Chŏn", :iso-numeric "408", :html-entity "&#x20A9;", :decimal-points 2, :name "North Korean Won", :iso-code "KPW", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "388", :html-entity "$", :decimal-points 2, :name "Jamaican Dollar", :iso-code "JMD", :symbol-first true, :priority 100}
   {:symbol "MK", :subunit "Tambala", :iso-numeric "454", :html-entity "", :decimal-points 2, :name "Malawian Kwacha", :iso-code "MWK", :symbol-first false, :priority 100}
   {:symbol "kr", :subunit "Eyrir", :iso-numeric "352", :html-entity "", :decimal-points 2, :name "Icelandic Króna", :iso-code "ISK", :symbol-first true, :priority 100}
   {:symbol "₨", :subunit "Paisa", :iso-numeric "356", :html-entity "&#x20A8;", :decimal-points 2, :name "Indian Rupee", :iso-code "INR", :symbol-first true, :priority 100}
   {:symbol "UM", :subunit "Khoums", :iso-numeric "478", :html-entity "", :decimal-points 1, :name "Mauritanian Ouguiya", :iso-code "MRO", :symbol-first false, :priority 100}
   {:symbol "₨", :subunit "Paisa", :iso-numeric "586", :html-entity "&#x20A8;", :decimal-points 2, :name "Pakistani Rupee", :iso-code "PKR", :symbol-first true, :priority 100}
   {:symbol "K", :subunit "Toea", :iso-numeric "598", :html-entity "", :decimal-points 2, :name "Papua New Guinean Kina", :iso-code "PGK", :symbol-first false, :priority 100}
   {:symbol "﷼", :subunit "Dinar", :iso-numeric "364", :html-entity "&#xFDFC;", :decimal-points 2, :name "Iranian Rial", :iso-code "IRR", :symbol-first true, :priority 100}
   {:symbol "؋", :subunit "Pul", :iso-numeric "971", :html-entity "", :decimal-points 2, :name "Afghan Afghani", :iso-code "AFN", :symbol-first false, :priority 100}
   {:symbol "₡", :subunit "Céntimo", :iso-numeric "188", :html-entity "&#x20A1;", :decimal-points 2, :name "Costa Rican Colón", :iso-code "CRC", :symbol-first true, :priority 100}
   {:symbol "ر.ع.", :subunit "Baisa", :iso-numeric "512", :html-entity "&#xFDFC;", :decimal-points 2, :name "Omani Rial", :iso-code "OMR", :symbol-first true, :priority 100}
   {:symbol nil, :subunit "Tiyin", :iso-numeric "860", :html-entity "", :decimal-points 2, :name "Uzbekistani Som", :iso-code "UZS", :symbol-first false, :priority 100}
   {:symbol "¥", :subunit "Fen", :iso-numeric "156", :html-entity "&#x5713;", :decimal-points 2, :name "Chinese Renminbi Yuan", :iso-code "CNY", :symbol-first true, :priority 100}
   {:symbol "฿", :subunit "Satang", :iso-numeric "764", :html-entity "&#x0E3F;", :decimal-points 2, :name "Thai Baht", :iso-code "THB", :symbol-first true, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "953", :html-entity "", :decimal-points 2, :name "Cfp Franc", :iso-code "XPF", :symbol-first false, :priority 100}
   {:symbol "Kč", :subunit "Haléř", :iso-numeric "203", :html-entity "", :decimal-points 2, :name "Czech Koruna", :iso-code "CZK", :symbol-first true, :priority 100}
   {:symbol "ރ.", :subunit "Laari", :iso-numeric "462", :html-entity "", :decimal-points 2, :name "Maldivian Rufiyaa", :iso-code "MVR", :symbol-first false, :priority 100}
   {:symbol nil, :subunit "Qəpik", :iso-numeric "944", :html-entity "", :decimal-points 2, :name "Azerbaijani Manat", :iso-code "AZN", :symbol-first true, :priority 100}
   {:symbol "₦", :subunit "Kobo", :iso-numeric "566", :html-entity "&#x20A6;", :decimal-points 2, :name "Nigerian Naira", :iso-code "NGN", :symbol-first false, :priority 100}
   {:symbol "T$", :subunit "Seniti", :iso-numeric "776", :html-entity "", :decimal-points 2, :name "Tongan Paʻanga", :iso-code "TOP", :symbol-first true, :priority 100}
   {:symbol "R$ ", :subunit "Centavo", :iso-numeric "986", :html-entity "R$", :decimal-points 2, :name "Brazilian Real", :iso-code "BRL", :symbol-first true, :priority 100}
   {:symbol "ден", :subunit "Deni", :iso-numeric "807", :html-entity "", :decimal-points 2, :name "Macedonian Denar", :iso-code "MKD", :symbol-first false, :priority 100}
   {:symbol "P", :subunit "Thebe", :iso-numeric "072", :html-entity "", :decimal-points 2, :name "Botswana Pula", :iso-code "BWP", :symbol-first true, :priority 100}
   {:symbol "£", :subunit "Penny", :iso-numeric "654", :html-entity "&#x00A3;", :decimal-points 2, :name "Saint Helenian Pound", :iso-code "SHP", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "840", :html-entity "$", :decimal-points 2, :name "United States Dollar", :iso-code "USD", :symbol-first true, :priority 1}
   {:symbol "TL", :subunit "kuruş", :iso-numeric "949", :html-entity "", :decimal-points 2, :name "Turkish Lira", :iso-code "TRY", :symbol-first false, :priority 100}
   {:symbol "L", :subunit "Ban", :iso-numeric "946", :html-entity "", :decimal-points 2, :name "Romanian Leu", :iso-code "RON", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Centésimo", :iso-numeric "858", :html-entity "&#x20B1;", :decimal-points 2, :name "Uruguayan Peso", :iso-code "UYU", :symbol-first true, :priority 100}
   {:symbol "د.م.", :subunit "Centime", :iso-numeric "504", :html-entity "", :decimal-points 2, :name "Moroccan Dirham", :iso-code "MAD", :symbol-first false, :priority 100}
   {:symbol nil, :subunit "Iraimbilanja", :iso-numeric "969", :html-entity "", :decimal-points 1, :name "Malagasy Ariary", :iso-code "MGA", :symbol-first false, :priority 100}
   {:symbol "ل.ل", :subunit "Piastre", :iso-numeric "422", :html-entity "&#x00A3;", :decimal-points 2, :name "Lebanese Pound", :iso-code "LBP", :symbol-first true, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "950", :html-entity "", :decimal-points 2, :name "Central African Cfa Franc", :iso-code "XAF", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Centavo", :iso-numeric "170", :html-entity "&#x20B1;", :decimal-points 2, :name "Colombian Peso", :iso-code "COP", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "430", :html-entity "$", :decimal-points 2, :name "Liberian Dollar", :iso-code "LRD", :symbol-first false, :priority 100}
   {:symbol "₨", :subunit "Cent", :iso-numeric "144", :html-entity "&#x0BF9;", :decimal-points 2, :name "Sri Lankan Rupee", :iso-code "LKR", :symbol-first false, :priority 100}
   {:symbol "դր.", :subunit "Luma", :iso-numeric "051", :html-entity "", :decimal-points 2, :name "Armenian Dram", :iso-code "AMD", :symbol-first false, :priority 100}
   {:symbol "$ or Esc", :subunit "Centavo", :iso-numeric "132", :html-entity "", :decimal-points 2, :name "Cape Verdean Escudo", :iso-code "CVE", :symbol-first false, :priority 100}
   {:symbol "Fr", :subunit "Rappen", :iso-numeric "756", :html-entity "", :decimal-points 2, :name "Swiss Franc", :iso-code "CHF", :symbol-first true, :priority 100}
   {:symbol "kn", :subunit "Lipa", :iso-numeric "191", :html-entity "", :decimal-points 2, :name "Croatian Kuna", :iso-code "HRK", :symbol-first true, :priority 100}
   {:symbol "£", :subunit "Penny", :iso-numeric "238", :html-entity "&#x00A3;", :decimal-points 2, :name "Falkland Pound", :iso-code "FKP", :symbol-first false, :priority 100}
   {:symbol "K", :subunit "Pya", :iso-numeric "104", :html-entity "", :decimal-points 2, :name "Myanmar Kyat", :iso-code "MMK", :symbol-first false, :priority 100}
   {:symbol "L", :subunit "Qintar", :iso-numeric "008", :html-entity "", :decimal-points 2, :name "Albanian Lek", :iso-code "ALL", :symbol-first false, :priority 100}
   {:symbol "kr", :subunit "Øre", :iso-numeric "578", :html-entity "kr", :decimal-points 2, :name "Norwegian Krone", :iso-code "NOK", :symbol-first true, :priority 100}
   {:symbol "ل.د", :subunit "Dirham", :iso-numeric "434", :html-entity "", :decimal-points 3, :name "Libyan Dinar", :iso-code "LYD", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "242", :html-entity "$", :decimal-points 2, :name "Fijian Dollar", :iso-code "FJD", :symbol-first false, :priority 100}
   {:symbol "£ or ل.س", :subunit "Piastre", :iso-numeric "760", :html-entity "&#x00A3;", :decimal-points 2, :name "Syrian Pound", :iso-code "SYP", :symbol-first false, :priority 100}
   {:symbol "₨", :subunit "Cent", :iso-numeric "480", :html-entity "&#x20A8;", :decimal-points 2, :name "Mauritian Rupee", :iso-code "MUR", :symbol-first true, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "262", :html-entity "", :decimal-points 2, :name "Djiboutian Franc", :iso-code "DJF", :symbol-first false, :priority 100}
   {:symbol "£", :subunit "Penny", :iso-numeric "292", :html-entity "&#x00A3;", :decimal-points 2, :name "Gibraltar Pound", :iso-code "GIP", :symbol-first true, :priority 100}
   {:symbol "лв", :subunit "Stotinka", :iso-numeric "975", :html-entity "", :decimal-points 2, :name "Bulgarian Lev", :iso-code "BGN", :symbol-first true, :priority 100}
   {:symbol "Db", :subunit "Cêntimo", :iso-numeric "678", :html-entity "", :decimal-points 2, :name "São Tomé and Príncipe Dobra", :iso-code "STD", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Centavo", :iso-numeric "484", :html-entity "$", :decimal-points 2, :name "Mexican Peso", :iso-code "MXN", :symbol-first true, :priority 100}
   {:symbol "ლ", :subunit "Tetri", :iso-numeric "981", :html-entity "", :decimal-points 2, :name "Georgian Lari", :iso-code "GEL", :symbol-first false, :priority 100}
   {:symbol "Ls", :subunit "Santīms", :iso-numeric "428", :html-entity "", :decimal-points 2, :name "Latvian Lats", :iso-code "LVL", :symbol-first true, :priority 100}
   {:symbol "£", :subunit "Penny", :iso-numeric "826", :html-entity "&#x00A3;", :decimal-points 2, :name "British Pound", :iso-code "GBP", :symbol-first true, :priority 3}
   {:symbol "₨", :subunit "Cent", :iso-numeric "690", :html-entity "&#x20A8;", :decimal-points 2, :name "Seychellois Rupee", :iso-code "SCR", :symbol-first false, :priority 100}
   {:symbol "Fr", :subunit "Centime", :iso-numeric "952", :html-entity "", :decimal-points 2, :name "West African Cfa Franc", :iso-code "XOF", :symbol-first false, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "090", :html-entity "$", :decimal-points 2, :name "Solomon Islands Dollar", :iso-code "SBD", :symbol-first false, :priority 100}
   {:symbol "Sh", :subunit "Cent", :iso-numeric "800", :html-entity "", :decimal-points 2, :name "Ugandan Shilling", :iso-code "UGX", :symbol-first false, :priority 100}
   {:symbol "L", :subunit "Centavo", :iso-numeric "340", :html-entity "", :decimal-points 2, :name "Honduran Lempira", :iso-code "HNL", :symbol-first true, :priority 100}
   {:symbol "ƒ", :subunit "Cent", :iso-numeric "533", :html-entity "&#x0192;", :decimal-points 2, :name "Aruban Florin", :iso-code "AWG", :symbol-first false, :priority 100}
   {:symbol "₨", :subunit "Paisa", :iso-numeric "524", :html-entity "&#x20A8;", :decimal-points 2, :name "Nepalese Rupee", :iso-code "NPR", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Peso", :iso-numeric "152", :html-entity "&#x20B1;", :decimal-points 0, :name "Chilean Peso", :iso-code "CLP", :symbol-first true, :priority 100}
   {:symbol "₩", :subunit "Jeon", :iso-numeric "410", :html-entity "&#x20A9;", :decimal-points 2, :name "South Korean Won", :iso-code "KRW", :symbol-first true, :priority 100}
   {:symbol "¥", :subunit nil, :iso-numeric "392", :html-entity "&#x00A5;", :decimal-points 0, :name "Japanese Yen", :iso-code "JPY", :symbol-first true, :priority 6}
   {:symbol "₮", :subunit "Möngö", :iso-numeric "496", :html-entity "&#x20AE;", :decimal-points 2, :name "Mongolian Tögrög", :iso-code "MNT", :symbol-first false, :priority 100}
   {:symbol "Kz", :subunit "Cêntimo", :iso-numeric "973", :html-entity "", :decimal-points 2, :name "Angolan Kwanza", :iso-code "AOA", :symbol-first false, :priority 100}
   {:symbol "S/.", :subunit "Céntimo", :iso-numeric "604", :html-entity "S/.", :decimal-points 2, :name "Peruvian Nuevo Sol", :iso-code "PEN", :symbol-first true, :priority 100}
   {:symbol "₲", :subunit "Céntimo", :iso-numeric "600", :html-entity "&#x20B2;", :decimal-points 2, :name "Paraguayan Guaraní", :iso-code "PYG", :symbol-first true, :priority 100}
   {:symbol "$", :subunit "Cent", :iso-numeric "052", :html-entity "$", :decimal-points 2, :name "Barbadian Dollar", :iso-code "BBD", :symbol-first false, :priority 100}
   {:symbol "Q", :subunit "Centavo", :iso-numeric "320", :html-entity "", :decimal-points 2, :name "Guatemalan Quetzal", :iso-code "GTQ", :symbol-first true, :priority 100}
   {:symbol "฿", :subunit "Satoshi", :decimal-points 4, :name "Bitcoin", :iso-code "BTC", :symbol-first true, :priority 1}])

(def iso->currency (reduce #(assoc % (keyword (:iso-code %2)) %2) {} currencies))

(defn iso$
  "Returns a currency for an iso code, regardless of it being string or keyword"
  [code]
  (iso->currency (keyword code)))

;; Default currency
(def ^:dynamic $ (iso$ (.getCurrencyCode (.getCurrency (java.text.NumberFormat/getCurrencyInstance)))))
