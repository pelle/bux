# bux

A money and currency manipulation library for Clojure

## Usage

Add the following to your project.clj

    [bux "0.0.1-SNAPSHOT"]

### Currencies

    (use 'bux.currency)

Create a currency using create-currency:

   (create-currency {:symbol "$", :decimal_mark ",", :thousands_separator ".", :subunit "Centavo", :name "Argentine Peso", :iso_code "ARS", :iso_numeric "032", 
    :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :priority 100})

    => #bux.currency.Currency{:iso_code "ARS", :name "Argentine Peso", :symbol "$", :subunit "Centavo", :subunit_to_unit 100, :symbol_first true, :html_entity "&#x20B1;", :decimal_mark ",", :thousands_separator ".", :iso_numeric "032", :priority 100}


Define currencies as vars in your current namespace:

   (defcurrency {:symbol "$", :decimal_mark ",", :thousands_separator ".", :subunit "Centavo", :name "Argentine Peso", :iso_code "ARS", :iso_numeric "032", 
    :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :priority 100})

    => #'user/ARS

Load up predefined currencies:

    (use 'bux.currencies)

This adds all current national currencies to the bux.currencies namespace using the ISO code as the symbol.

    bux.currencies/USD

    => #bux.currency.Currency{:iso_code "USD", :name "United States Dollar", :symbol "$", :subunit "Cent", :subunit_to_unit 100, :symbol_first true, :html_entity "$", :decimal_mark ".", :thousands_separator ",", :iso_numeric "840", :priority 1}

### Money (not done)

A money object should act like a number but be associated with a currency.

The plan is to use the above currency as a function with an integer cents value in the constructor.

## License

Copyright (C) 2012 Pelle Braendgaard

Distributed under the Eclipse Public License, the same as Clojure.
