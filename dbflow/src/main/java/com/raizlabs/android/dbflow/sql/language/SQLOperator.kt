package com.raizlabs.android.dbflow.sql.language

import com.raizlabs.android.dbflow.sql.QueryBuilder

/**
 * Description: Basic interface for all of the Operator classes.
 */
interface SQLOperator {

    /**
     * Appends itself to the [QueryBuilder]
     *
     * @param queryBuilder The builder to append to.
     */
    fun appendConditionToQuery(queryBuilder: QueryBuilder<*>)

    /**
     * The name of the column.
     *
     * @return The column name.
     */
    fun columnName(): String

    /**
     * The separator for this condition when paired with a [OperatorGroup]
     *
     * @return The separator, an AND, OR, or other kinds.
     */
    fun separator(): String?

    /**
     * Sets the separator for this condition
     *
     * @param separator The string AND, OR, or something else.
     * @return This instance.
     */
    fun separator(separator: String): SQLOperator

    /**
     * @return true if it has a separator, false if not.
     */
    fun hasSeparator(): Boolean

    /**
     * @return the operation that is used.
     */
    fun operation(): String

    /**
     * @return The raw value of the condition.
     */
    fun value(): Any?

}