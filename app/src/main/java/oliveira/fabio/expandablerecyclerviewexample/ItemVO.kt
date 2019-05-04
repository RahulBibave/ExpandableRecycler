package oliveira.fabio.expandablerecyclerviewexample

data class ItemVO(val title: String, val subItemsList: List<SubItemVO>)
data class SubItemVO(val description: String, val money: String)