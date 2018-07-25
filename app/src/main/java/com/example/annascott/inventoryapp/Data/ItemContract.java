package com.example.annascott.inventoryapp.Data;

import android.provider.BaseColumns;

public final class ItemContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ItemContract() {}

    /**
     * Inner class that defines constant values for the items database table.
     * Each entry in the table represents a single item.
     */
    public static final class ItemEntry implements BaseColumns {

        /** Name of database table for items */
        public final static String TABLE_NAME = "inventory";

        /**
         * Unique ID number for the item (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the item.
         *
         * Type: TEXT
         */
        public final static String COLUMN_ITEM_NAME ="name";

        /**
         * Price of the item.
         *
         * Type: TEXT
         */
        public final static String COLUMN_ITEM_PRICE = "price";

        /**
         * Quantity of the items.
         *
         *
         * Type: INTEGER
         */
        public final static String COLUMN_ITEM_QUANTITY = "quantity";

        /**
         * Supplier of the item.
         *
         * Type: TEXT
         */
        public final static String COLUMN_ITEM_SUPPLIER = "supplier";

        /**
                * Supplier's phone number.
                *
                * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_PHONE_NUMBER = "supplier_phone_number";
    }
}


