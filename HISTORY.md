# Changelog

### TODO
- add methods for ARS and CHF special rounding (http://xencraft.com/resources/multi-currency.html#rounding)
- add formatting for (MRO and MGA) who both are divided into 1/5 subunits
- simplify create-currency and perhaps reintroduce defcurrency
- improve parse$

### 0.2.1
- Temporarily get rid of defcurrency.
- bux.currencies defines vars for each currency manually instead of iterating through a hash and doing it.
- bux.currencies/default-currency changed to bux.currencies/$
- removed subunit-to-unit

### 0.2.0
- Got rid of cryptic function names. 
- Number is actual number and not subunit
- Use BigDecimal scale to round numbers
- Currency functions eg. USD JPY now return a properly scaled bigdecimal for strings and numbers

### 0.1.0 
- Removed money type. It now just uses clojure numbers as subunits.

### 0.0.4
- Added better documentation. 
- Added discount and parse-amount

### 0.0.3
- remove decimal_point and thousands_separator as we will let the locale take care of that.

### 0.0.2
- moneys are now defined using a type. 
- Formatting uses locales Decimal formatter. 
- Basic calculations are implemented
- Added Bitcoin

### 0.0.1
- added money type and date formatting
- initial implementation of currencies